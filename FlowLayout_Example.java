

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayout_Example extends JFrame { // �̳д�����JFrame
	public static void main(String args[]) {
		FlowLayout_Example frame = new FlowLayout_Example();
		frame.setVisible(true); // ���ô���ɼ���Ĭ��Ϊ���ɼ�
	}

	public FlowLayout_Example() {
		super(); // �̳и���Ĺ��췽��
		setTitle("�����ֹ�����ʾ��"); // ���ô���ı���
		setBounds(100, 100, 500, 375); // ���ô������ʾλ�ü���С
		getContentPane().setLayout(null); // ����Ϊ�������κβ��ֹ�����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ���ô���رհ�ť�Ķ���Ϊ�˳�

		final FlowLayout flowLayout = new FlowLayout(); // ���������ֹ���������
		flowLayout.setHgap(10); // ���������ˮƽ���
		flowLayout.setVgap(10); // ��������Ĵ�ֱ���
		flowLayout.setAlignment(FlowLayout.LEFT); // ��������Ķ��뷽ʽ
		getContentPane().setLayout(flowLayout); // ��������������������ֹ�����

		final JButton aButton = new JButton();
		aButton.setText("��ť A");
		getContentPane().add(aButton);

		final JButton bButton = new JButton();
		bButton.setText("��ť B");
		getContentPane().add(bButton);

		final JButton cButton = new JButton();
		cButton.setText("��ť C");
		getContentPane().add(cButton);

	}

}
