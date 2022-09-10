# atm-management
The ATM will service one customer at a time. A customer
will be required to enter an account number, personal
identification number (PIN) – both of which will be sent to the
database for validation on login. The customer will then be able to
perform one or more transactions.
If the database determines that the customer’s Account
Number and PIN is invalid at login, the customer will be required
to re-enter the credentials before logging in.
The ATM application will communicate with the database on
each transaction and verify the same. In the case of an amount
withdrawal, a second message will be sent after the transaction is
completed indicating successful transaction completion. The ATM
will provide the customer details of each successful transaction,
showing the auto generated transaction id, date, time, amount,
type of transaction and account number thus providing easy
access to the data for the customer. Users can also view their
account balance.
# Features:
- Account Balance
- Money Withdrawal
- Account Ministatement
- Account Pin Change
