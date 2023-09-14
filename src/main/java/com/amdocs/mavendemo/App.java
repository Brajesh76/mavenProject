package com.amdocs.mavendemo;


public class App 
{
	
//	
    public static void main( String[] args )
    {
        Employee e=new Employee(1);
        e.setName("Brajesh");
        e.setSalary(100);
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        System.out.println(e.getId());

    }
}

class Employee{
	private  String name;
	private int salary;
	private int id;
	
	Employee(int id)
	{
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public String getName()
	{
		return this.name;
	}
	public int getSalary()
	{
		return this.salary;
	}
	public int getId()
	{
		return this.id;
	}
	
}