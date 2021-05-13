package design.behavioral.command.search;

public class TransactionSearch implements Search {
   public static String TRANSACTION_ID = "TRX_ID";
   private SearchForm searchForm;

   public TransactionSearch(SearchForm searchForm){
      this.searchForm = searchForm;
   }

   public void search() {
    System.out.println("Searching Transaction by "+searchForm.getParamerters().keySet());
   }
}