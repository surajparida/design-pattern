package design.behavioral.command.search;

public class AddressSearch implements Search {
   private SearchForm searchForm;
   public static String ADDRESS_ID = "ADDR_ID";

   public AddressSearch(SearchForm searchForm){
      this.searchForm = searchForm;
   }

   public void search() {
      System.out.println("Searching Address by "+searchForm.getParamerters().keySet());
   }
}