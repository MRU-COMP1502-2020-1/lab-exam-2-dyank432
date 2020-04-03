package lsystems;

import java.util.List;
import java.util.Set;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException 
	{
			for (LRule rule : rules)
			{
				char newLine[];
				
			//	if (rule.getMatch() != 'A' || rule.getMatch() != 'B' || rule.getMatch() != 'C')
				if (rule.getMatch() != 'A' && rule.getMatch() != 'B' && rule.getMatch() != 'C')
				{
					throw new LSystemSymbolException();
				}
				else if (line == null)
				{
					throw new LSystemLengthException(); 
				}
				
				for (int i = 0; i < line.length; i++)
				{
					if (line[i] == rule.getMatch())
					{
						line = rule.getBody();
					}
				}
			}
	}
	
	
	
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
