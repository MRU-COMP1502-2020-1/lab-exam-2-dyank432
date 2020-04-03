package lsystems;

public class A_AA extends LRule{

	@Override
	public char getMatch() {
		// TODO Auto-generated method stub
		return 'A';
	}

	@Override
	public char[] getBody() {
		char[] body = {'A','A'};
		return body;
	}

}
