public class Main{
	
	
	
	public static void main(String[] args){
		Faculty itis = new Faculty();
		Queue<String> queue = new Queue<>(15);
		for(int i = 0; i < itis.getSize(); i++){
			try{
				queue.poll(itis.getStudent());
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		showQueue((String[])queue.getQueue(), queue);
	}
	
	private static void showQueue(String [] studentsNames, Queue queue){
		for(int i = queue.getHead(); i < queue.size(); i++){
			System.out.println(studentsNames[i]);
		}
	}
	
}
