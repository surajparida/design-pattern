package com.mi.patterns.behavioral.command.search;

public class AddressSearch implements Search {
    public static String ADDRESS_ID = "ADDR_ID";
    private SearchForm searchForm;

    public AddressSearch(SearchForm searchForm) {
        this.searchForm = searchForm;
    }

    public void search() {
        System.out.println("Searching Address by " + searchForm.getParamerters().keySet());
    }
}
