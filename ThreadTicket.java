
public class ThreadTicket {  
public static void main(String[] args) {  
MyThread mt1=new MyThread();  
MyThread mt2=new MyThread();  
MyThread mt3=new MyThread();  
mt1.start();//ÿ���̶߳�������10�ţ�������30��Ʊ  
mt2.start();//��ʵ��ֻ��10��Ʊ��ÿ���̶߳����Լ���Ʊ  
mt3.start();//û�дﵽ��Դ����  
}  
} 