"""Welcome to Reflex! This file outlines the steps to create a basic app."""

import reflex as rx
import requests

from rxconfig import config



class FormState(rx.State):
    form_data: dict = {}

    def handle_submit(self, form_data: dict):
        """Handle the form submit."""
        self.form_data = form_data
        print("balls")
        
        url = "https://ferrets.b28.dev/is_poisoned"
        method = "GET"

        response = requests.get(url)
        print(response)
    

def index():
    return rx.vstack(
        rx.form(
            rx.vstack(
                rx.input(
                    placeholder = "Balls count",
                    name = "balls_count",
                    size = "3"
                ),
                rx.button(
                    "Submit",
                    type = "submit",
                    size = '4',
                ),
            ),
            on_submit = FormState.handle_submit,
            reset_on_submit = True,
            
        ),
        rx.divider(),
        rx.heading("Results"),
        rx.text(FormState.form_data.to_string()),
    )

app = rx.App(config=config)
app.add_page(index)
app._compile()
