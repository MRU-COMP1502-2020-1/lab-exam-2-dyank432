package lsystems;

public class A_BC extends LRule{

	@Override
	public char getMatch() {
		// TODO Auto-generated method stub
		return 'A';
	}

	@Override
	public char[] getBody() {
		char[] body = {'B','C'};
		return body;
	}

}
