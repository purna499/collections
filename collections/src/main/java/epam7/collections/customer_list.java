package epam7.collections;
import java.util.*;
public class customer_list {

	public  Object customer_list[];
	 int index = 0;
	public customer_list() {
		customer_list=new Object[10];
	}
	public Object fetching(int ind) {
	if(ind <index) {
	return customer_list[ind];
	}
	else {
	throw new ArrayIndexOutOfBoundsException();
	}
	}
	public void adding(Object obj) {
	if(customer_list.length-index<=6)
	resize();
	customer_list[index++]=obj;
	}
	public int size() {
	return index;
	}
	private void resize() {
		customer_list=Arrays.copyOf(customer_list,customer_list.length*2);
	}
	public String toString() {
	String s="[";
	for(int i=0;i<index-1;i++) {
	s+=customer_list[i]+",";
	}
	s+=customer_list[index-1]+"]";
	return s;
	}
	 public Object remove(int ind){
	       if(ind < index){
	           Object obj = customer_list[ind];
	           customer_list[ind] = null;
	           int tmp = ind;
	           while(tmp < ind){
	        	   customer_list[tmp] = customer_list[tmp+1];
	        	   customer_list[tmp+1] = null;
	               tmp++;
	           }
	           index--;
	           return obj;
	       } else {
	           throw new ArrayIndexOutOfBoundsException();
	       }
	

}
}