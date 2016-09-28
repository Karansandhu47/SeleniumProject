package Lessons;


public class LearningLessonOne {

	
	 private int eat(LearningLessonOne h){
		 h.doNothing();
		 System.out.println(h);
		 return 20;
		// 
		 
	 }
	 
	 private void doNothing(){
		 
	 }
	 
	 public static void go(){
		 LearningLessonOne f = new LearningLessonOne();
		 LearningLessonOne g = new LearningLessonOne();
		 int u = f.eat(g);
		 System.out.println(u);
	 }
	 
	 public static void main(String[] args) {
		 go();
	}
	 
}
