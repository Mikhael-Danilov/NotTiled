package com.mirwanda.nottiled;
import java.util.*;

public class objgroup
{
	private java.util.List<obj> objects = new ArrayList<obj>();
	private String name;
	public objgroup(){}
	public void setObjects(java.util.List<obj> objects)
	{
		this.objects = objects;
	}

	public java.util.List<obj> getObjects()
	{
		return objects;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}}
