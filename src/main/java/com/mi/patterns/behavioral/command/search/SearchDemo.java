package com.mi.patterns.behavioral.command.search;

public class SearchDemo {
   public static void main(String[] args) {

      SearchForm transactionForm = new SearchForm();
      transactionForm.setParameter(TransactionSearch.TRANSACTION_ID,"9911933");

       TransactionSearch transactionSearch = new TransactionSearch(transactionForm);

      SearchForm addressForm = new SearchForm();
      addressForm.setParameter(AddressSearch.ADDRESS_ID,"359549");
       AddressSearch addressSearch = new AddressSearch(addressForm);

      SearchManager searchManager = new SearchManager();
      searchManager.add(transactionSearch);
      searchManager.add(addressSearch);
      searchManager.start();
   }
}
