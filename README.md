# bank-app

## Prerequisites

- Maven

## Build

```zsh
mvn package
```

## Run the app

To add your student ID to BankAccountDetails you must provide `AOP_ID` environment variable. -> Replace `1337` below with your student ID.

```zsh
AOP_ID=1337 java -cp target/bank-app-1.0-SNAPSHOT.jar sample.spring.practice.springbankapp.SpringBankApp
```

