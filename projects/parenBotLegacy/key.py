import tweepy

api_key = "rL7hE53QOp9L4vSIgWAMLBJDk"
api_secret = "wp7V1D3R9UHqOECnMlYMeKgdq8DwJg5s75QGvuqelGUGezaSpS"
bearer_token = r"AAAAAAAAAAAAAAAAAAAAAICGtAEAAAAAjQk8yKkScSuTl0x0xjQguxE37IE%3DLtAclkzFUXftlLfXirpMgDZeD939e7zJJJfgE81qgbt4JQlIS0"
access_token = "1775325324060008448-e5qmVoVkVVU6fFMM6464ufvYbUtkiP"
access_token_secret = "2ChX2fRp1QjhlS10FRFgbWa3xgffIqXdp6t1Ugghe3LhI"


client = tweepy.client(bearer_token, api_key, api_secret, access_token, access_token_secret)
authorization = tweepy.OAuth1Userhandler(api_key, api_secret, access_token, access_token_secret)
api = tweepy.API(authorization)
