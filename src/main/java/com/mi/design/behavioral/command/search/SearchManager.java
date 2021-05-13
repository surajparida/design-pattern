package design.behavioral.command.search;

import java.util.ArrayList;
import java.util.List;

public class SearchManager {
private List<Search> searchTasks = new ArrayList<Search>();

public void add(Search search){
   searchTasks.add(search);
}

public void start(){

   for (Search search : searchTasks) {
      search.search();
   }
   searchTasks.clear();
}
}