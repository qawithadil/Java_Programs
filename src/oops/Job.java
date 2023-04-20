package oops;

public class Job {

	public static void main(String[] args) {
		FatherJob f = new FatherJob();
		// f.job();
		SonJob s = new SonJob();
		s.job();
		s.otherjob();

	}

}

class FatherJob {

	private void job() {
		System.out.println("Father - Goverment Job..");
	}

	public void otherjob() {
		System.out.println("Father - You can do any job");
	}

}

class SonJob extends FatherJob {

	protected void job() {
		System.out.println("Son-Private job...");
	
	}
}
