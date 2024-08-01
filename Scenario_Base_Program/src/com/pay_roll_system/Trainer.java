package com.pay_roll_system;

public class Trainer {

	int Id;
	String Name;
	double basicSalary;
	double HRAper;
	double DAper;
	int batchCount;
	double perkPerBatch;

	public Trainer(int id, String name, double basicSalary, double hRAper, double dAper, int batchCount,
			double perkPerBatch) {
		super();
		Id = id;
		Name = name;
		this.basicSalary = basicSalary;
		HRAper = hRAper;
		DAper = dAper;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}

	public double calculateGrossSalary() {

		double grossSalary = basicSalary + HRAper + DAper + (batchCount * perkPerBatch);

		return grossSalary;

	}

	@Override
	public String toString() {
		return "Trainer detail[Id=" + Id + ", Name=" + Name + ", basicSalary=" + basicSalary + ", HRAper=" + HRAper
				+ ", DAper=" + DAper + ", batchCount=" + batchCount + ", perkPerBatch=" + perkPerBatch + "]";
	}

}
