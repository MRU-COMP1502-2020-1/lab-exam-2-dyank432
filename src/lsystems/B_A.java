package lsystems;

public class B_A extends LRule{

	@Override
	public char getMatch() {
		// TODO Auto-generated method stub
		return 'B';
	}

	@Override
	public char[] getBody() {
		char[] body = {'A'};
		return body;
	}
}
