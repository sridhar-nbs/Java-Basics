package multithreading;

class TestSleepMethod1 extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		TestSleepMethod1 t1 = new TestSleepMethod1();
		TestSleepMethod1 t2 = new TestSleepMethod1();
		 System.out.println("As you can see in the current program that there is context-switching, because here t1 and t2 will be treated as thread object");
		t1.start();
		t2.start();
	}
}



class TestCallRun2 extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		TestCallRun2 t1 = new TestCallRun2();
		TestCallRun2 t2 = new TestCallRun2();
        System.out.println("As you can see in the current program that there is no context-switching, because here t1 and t2 will be treated as normal object not thread object");
		t1.run();
		t2.run();
	}
}




class TestJoinMethod1 extends Thread{  
    public void run(){  
     for(int i=1;i<=5;i++){  
      try{  
       Thread.sleep(500);  
      }catch(Exception e){System.out.println(e);}  
     System.out.println(i);  
     }  
    }  
   public static void main(String args[]){  
    TestJoinMethod1 t1=new TestJoinMethod1();  
    TestJoinMethod1 t2=new TestJoinMethod1();  
    TestJoinMethod1 t3=new TestJoinMethod1();  
    System.out.println("As you can see in the current example,when t1 completes its task then, t2 and t3 starts executing");
    t1.start();  
    try{  
     t1.join();  
    }catch(Exception e){System.out.println(e);}  
     
    t2.start();  
    t3.start();  
    }  
   }  



class TestJoinMethod2 extends Thread{  
    public void run(){  
     for(int i=1;i<=5;i++){  
      try{  
       Thread.sleep(500);  
      }catch(Exception e){System.out.println(e);}  
     System.out.println(i);  
     }  
    }  
   public static void main(String args[]){  
    TestJoinMethod2 t1=new TestJoinMethod2();  
    TestJoinMethod2 t2=new TestJoinMethod2();  
    TestJoinMethod2 t3=new TestJoinMethod2();  
    t1.start();  
    try{  
     t1.join(1500);  
    }catch(Exception e){System.out.println(e);}  
     System.out.println("In the current example,when t1 is completes its task for 1500 miliseconds(3 times) then t2 and t3 starts executing");
    t2.start();  
    t3.start();  
    }  
   }  



class TestJoinMethod3 extends Thread{  
    public void run(){  
     System.out.println("running...");  
     System.out.println(Thread.currentThread().getName());  
    }  
   public static void main(String args[]){  
    TestJoinMethod3 t1=new TestJoinMethod3();  
    TestJoinMethod3 t2=new TestJoinMethod3();  
    System.out.println("Name of t1:"+t1.getName());  
    System.out.println("Name of t2:"+t2.getName());  
    System.out.println("id of t1:"+t1.getId());  
    
    t1.start();  
    t2.start();  
    
    t1.setName("Sridhar");  
    System.out.println("After changing name of t1:"+t1.getName());  
   }  
  }  



class TestMultiPriority1 extends Thread{  
    public void run(){  
      System.out.println("running thread name is:"+Thread.currentThread().getName());  
      System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
     
     }  
    public static void main(String args[]){  
     TestMultiPriority1 m1=new TestMultiPriority1();  
     TestMultiPriority1 m2=new TestMultiPriority1();  
     m1.setName("sridhar_min");
     m2.setName("sridhar_max");
     m1.setPriority(Thread.MIN_PRIORITY);  
     m2.setPriority(Thread.MAX_PRIORITY);  
     m1.start();  
     m2.start();  
      
    }  
   }     