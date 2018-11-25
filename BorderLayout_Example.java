

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayout_Example extends JFrame { // �̳д�����JFrame
	public static void main(String args[]) {
		BorderLayout_Example frame = new BorderLayout_Example();
		frame.setVisible(true); // ���ô���ɼ���Ĭ��Ϊ���ɼ�
	}

	public BorderLayout_Example() {
		super(); // �̳и���Ĺ��췽��
		setTitle("�߽粼�ֹ�����ʾ��"); // ���ô���ı���
		setBounds(100, 100, 500, 375); // ���ô������ʾλ�ü���С
		getContentPane().setLayout(null); // ����Ϊ�������κβ��ֹ�����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ���ô���رհ�ť�Ķ���Ϊ�˳�

		final BorderLayout borderLayout = new BorderLayout(); // �����߽粼�ֹ���������
		borderLayout.setHgap(10); // ���������ˮƽ���
		borderLayout.setVgap(10); // ��������Ĵ�ֱ���
		Container panel = getContentPane(); // �����������
		panel.setLayout(borderLayout); // �����������ñ߽粼�ֹ�����

		final JButton aButton = new JButton();
		aButton.setText("��ť A");
		panel.add(aButton, BorderLayout.NORTH); // ����

		final JButton bButton = new JButton();
		bButton.setText("��ť B");
		panel.add(bButton, BorderLayout.WEST); // ���

		final JButton cButton = new JButton();
		cButton.setText("��ť C");
		panel.add(cButton, BorderLayout.CENTER);// �м�

		final JButton dButton = new JButton();
		dButton.setText("��ť D");
		panel.add(dButton, BorderLayout.EAST); // �Ҳ�

		final JButton eButton = new JButton();
		eButton.setText("��ť E");
		panel.add(eButton, BorderLayout.SOUTH); // �ײ�

	}

}
