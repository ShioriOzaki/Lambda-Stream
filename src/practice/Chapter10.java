package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Chapter10 {

	public static void main(String[] args) {
		List<Task> list = new ArrayList<>();
        list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う", true));
        list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接", false));
        list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う", true));
        list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く", false));
        list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く", false));
        
        long Tasknum = 
        list.stream()
        	.filter(l -> l.isDone() == false).count();
        System.out.printf("未完了のタスクの個数は%d\n", Tasknum);
        System.out.println("【未完了のタスクを昇順に並び替えて一覧表示】");
        	
        list.stream()
    		.filter(l -> l.isDone() == false)
        	.sorted((l1,l2) -> l1.compareTo(l2))
        	.map(l -> l.toString())
        	.forEach(System.out::println);
       

	}

}
