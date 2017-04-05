package sample.spring.practice.springbankapp.dao;

import org.springframework.stereotype.Repository;

import sample.spring.practice.springbankapp.domain.BankAccountDetails;

@Repository(value = "bankAccountDao")
public class BankAccountDaoImpl implements BankAccountDao {

	@Override
	public int createBankAccount(final BankAccountDetails bankAccountDetails) {
		
		//--create account and return it's primary key.
		return 1;
	}

	public void subtractFromAccount(int bankAccountId, int amount) {
		//-- subtract fixed deposit amount from bank account
	}
}
