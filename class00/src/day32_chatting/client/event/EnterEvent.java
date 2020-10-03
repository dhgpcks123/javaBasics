package day32_chatting.client.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import day32_chatting.client.ClientController;

public class EnterEvent implements KeyListener {
	public ClientController main;
	
	public EnterEvent(ClientController main) {
		this.main = main;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// 어떤 키가 눌려졌는지 알아낸다.
		char ch = e.getKeyChar(); // 눌려진 키의 문자를 반환해주는 함수
		if((int) ch == 10 ) {
			main.evt.sendProc();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {}

}
