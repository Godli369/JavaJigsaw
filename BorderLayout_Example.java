

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayout_Example extends JFrame { // 继承窗体类JFrame
	public static void main(String args[]) {
		BorderLayout_Example frame = new BorderLayout_Example();
		frame.setVisible(true); // 设置窗体可见，默认为不可见
	}

	public BorderLayout_Example() {
		super(); // 继承父类的构造方法
		setTitle("边界布局管理器示例"); // 设置窗体的标题
		setBounds(100, 100, 500, 375); // 设置窗体的显示位置及大小
		getContentPane().setLayout(null); // 设置为不采用任何布局管理器
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置窗体关闭按钮的动作为退出

		final BorderLayout borderLayout = new BorderLayout(); // 创建边界布局管理器对象
		borderLayout.setHgap(10); // 设置组件的水平间距
		borderLayout.setVgap(10); // 设置组件的垂直间距
		Container panel = getContentPane(); // 获得容器对象
		panel.setLayout(borderLayout); // 设置容器采用边界布局管理器

		final JButton aButton = new JButton();
		aButton.setText("按钮 A");
		panel.add(aButton, BorderLayout.NORTH); // 顶部

		final JButton bButton = new JButton();
		bButton.setText("按钮 B");
		panel.add(bButton, BorderLayout.WEST); // 左测

		final JButton cButton = new JButton();
		cButton.setText("按钮 C");
		panel.add(cButton, BorderLayout.CENTER);// 中间

		final JButton dButton = new JButton();
		dButton.setText("按钮 D");
		panel.add(dButton, BorderLayout.EAST); // 右侧

		final JButton eButton = new JButton();
		eButton.setText("按钮 E");
		panel.add(eButton, BorderLayout.SOUTH); // 底部

	}

}
