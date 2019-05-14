import java.util.Arrays;

public class ArrayStack {
	
		private String[] data=new String[10];
		private int size;

		public void push(String str) {
			
			if (size>data.length) {
				data=Arrays.copyOf(data, data.length*2);
			}
			data[size++]=str;
		}
		
		public String peek() {
			if (size==0) {
				return null;
			}
			return data[size-1]; 
		}
		
		public String pop() {
			String str=this.peek();
			size--;                
			return str;
		}
		public boolean empty() {
			return size==0;
		}
}
