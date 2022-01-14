
public class DaemonThread implements  Runnable
{
	
	

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		
		while (true)
		{
			System.out.println("!!!!! 데몬 완전 쓰레드 실행 중 !!!!!");
			
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Thread t = new   Thread(new DaemonThread());
		t.setDaemon(true);
		t.start();
		
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" 쓰레드 종료 ");

	}

}
