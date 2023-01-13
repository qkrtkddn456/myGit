package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
//MouseLisner : 마우스이벤트 처리를 위한 인터페이스
//MouserMotionListner : 마우스 이동 이벤트 처리를 위한 인터페이스
//KeyListener : 키보드 이벤트 처리를 위한 인터페이스

public class KeyMouseExam extends JApplet 
implements MouseListener, MouseMotionListener, KeyListener{
	private int x,y;//이미지를 출력할 좌표값
	private int width, height;//이미지 가로,세로 사이즈
	private Image img;//이미지를 다룰 객체
	private boolean flag = false;//이미지가 처음실행할땐 안보이게 false로씀
	
	@Override
	public void init() {
		setSize(300,300);//화면 사이즈
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		this.addMouseListener(this);//현재 클래스에 마우스 이벤트 기능을 추가(중요코드)
		this.addMouseMotionListener(this);
		this.addKeyListener(this);//현재 클래스에 키이벤트 기능 추가
		setFocusable(true);//키입력을 받을 수 있도록 설정
		requestFocus();
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//이미지의 가로,세로 길이 계산
		width = img.getWidth(null);
		height = img.getHeight(null);
		System.out.println(width+","+height);
		if(flag) {
			g.drawImage(img, x, y, this);
		}
	
				
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		//마우스를 드래그할때 호출
		System.out.println("mouse drag: x: " + x+ ", y:"+y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//마우스가 이동했지만 버튼이 작동하지 않은 경우에 호출.
		x = e.getX();
		y = e.getY();
		System.out.println("mouse drag");
		
				
	}

	//컴퍼넌트상에서 마우스 버튼을 클릭(눌렀다 놓을때)했을때 호출
	@Override
	public void mouseClicked(MouseEvent e) {
		flag = true;//클릭할때 그림 true로 설정해서 보여지게함.
		x = e.getX();
		y = e.getY();
		repaint();//그래픽 갱신 요청 => paint()가 호출됨
			
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//컴퍼넌트상에서 마우스 버튼을 누를떄 호출
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//마우스를 떼어 놓아질때 호출		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//마우스가 해당 컴퍼넌트에 진입할때 호출
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//마우스가 컴퍼넌트를 종료하면 호출
	}
	
}
