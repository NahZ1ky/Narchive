class ATM:
  def __init__(self, amount):
    self.__balance = amount
  def deposit(self, amount):
    self.__balance = self.__balance + amount
    self.check()
  def withdraw(self, amount):
    if amount <= self.__balance:
      self.__balance = self.__balance - amount
      self.check()
    else: 
      self.check()

  def check(self):
    print("your current balance is: %.2f"%self.__balance)


tom_atm = ATM(500)
tom_atm.deposit(200)
tom_atm.withdraw(100.34)
tom_atm.check()