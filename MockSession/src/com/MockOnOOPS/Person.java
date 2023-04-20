package com.MockOnOOPS;

class JoiningDate {

	int DD;
	int MM;
	int YYYY;

	public int getDD() {
		return DD;
	}

	public void setDD(int dD) {
		DD = dD;
	}

	public int getMM() {
		return MM;
	}

	public void setMM(int mM) {
		MM = mM;
	}

	public int getYYYY() {
		return YYYY;
	}

	public void setYYYY(int yYYY) {
		YYYY = yYYY;
	}

	@Override
	public String toString() {
		return "JoiningDate [DD=" + DD + ", MM=" + MM + ", YYYY=" + YYYY + "]";
	}

}

class Job {

	int jobId;
	String profile;
	JoiningDate jd;

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public JoiningDate getJd() {
		return jd;
	}

	public void setJd(JoiningDate jd) {
		this.jd = jd;
	}

	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", profile=" + profile + ", jd=" + jd + "]";
	}

}

public class Person {

	int id;
	String name;
	Job job;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", job=" + job + "]";
	}

	public static void main(String[] args) {

		Person p = new Person();
		Job j = new Job();
		JoiningDate d = new JoiningDate();

		p.setId(1);
		p.setName("Sudanshu");
		p.setJob(j);

		p.getJob().setJobId(101);
		p.getJob().setProfile("Senior Manager");

		p.getJob().setJd(d);
		p.getJob().getJd().setDD(18);
		p.getJob().getJd().setMM(04);
		p.getJob().getJd().setYYYY(2023);

		System.out.println(p);

	}
}
