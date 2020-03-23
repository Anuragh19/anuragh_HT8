package com.vnr.anuragh;

public class RemoveAFromStart2Positions {

	boolean isTwoAsAtstart2Positions(Character Char,Integer index)
    {
    	return (Char!='A')||(Char=='A' && index>1);
    }
	String removingA(String input)
	{
		String output="";
		for(int position=0;position<input.length();position++)
    	{
    		if((isTwoAsAtstart2Positions(input.charAt(position),position)))
    		{
    			output+=input.charAt(position);
    		}
    	}
		return output;
	}
}
