package pm;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ex6_Frame extends JFrame implements MouseListener {

   //현재 창에 들어가는 모든 것들을 멤버로 선언
   JPanel north_p;
   JButton bt1, bt2, bt3;
   JTextArea ta; //여러 줄을 입력할 수 있는 텍스트 상자
   
   public Ex6_Frame() {
      north_p = new JPanel();
      bt1 = new JButton("RED");
      bt2 = new JButton("GREEN");
      bt3 = new JButton("Blue");
      ta = new JTextArea();
      
      //위에서 생성한 객체들을 배치시켜야한다.
      //먼저 North영역에 들어갈 버튼들을 north_p에 추가
      north_p.add(bt1);
      north_p.add(bt2);
      north_p.add(bt3);
      
      //현재 창 North영역에 north_p 추가
      //스크롤바의 역할을 하는 객체 생성
      
      this.add(north_p,BorderLayout.NORTH);
      
      //현재 창 가운데에 ta를 추가한다.
      JScrollPane jp = new JScrollPane(ta);
      this.add(jp); //뒤에 아무것도 적지 않으면 center에 들어감
      
      //이벤트 감지자 등록 - 생성자에서 
      bt1.addMouseListener(this);
      bt2.addMouseListener(this);
      bt3.addMouseListener(this);
      
      setSize(500, 500);
      setLocation(200,300);
      setVisible(true);
      
   }
   
   public static void main(String[] args) {
      //프로그램 시작
      
      Ex6_Frame f = new Ex6_Frame();
      
      
   }

   @Override
   public void mouseClicked(MouseEvent e) {
      // TODO Auto-generated method stub
      
      
   }

   @Override
   public void mousePressed(MouseEvent e) {
      // 마우스 버튼을 누를 때마다 호출하여 수행하는 곳
      //이벤트를 발생시킨 객체를 얻어낸다.
      
      Object obj = e.getSource();
      if(obj == bt1) { 
         //주소값 비교
         //이벤트를 발생시킨 객체가 bt1일 때 수행
         ta.append("RED\r\n");
      }
      else if (obj == bt2) {
         ta.append("GREEN\r\n");
      }
      else
         ta.append("BLUE\r\n");
      
      
   }

   @Override
   public void mouseReleased(MouseEvent e) {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void mouseEntered(MouseEvent e) {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void mouseExited(MouseEvent e) {
      // TODO Auto-generated method stub
      
   }

}
