package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javaguides.springboot.model.Account;

public interface AccountService {
	List<Account> getAllAccounts();
	void saveAccount(Account employee);
	Account getAccountById(long id);
	void deleteAccountById(long id);
	Page<Account> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
