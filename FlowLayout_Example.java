

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayout_Example extends JFrame { // 继承窗体类JFrame
	public static void main(String args[]) {
		FlowLayout_Example frame = new FlowLayout_Example();
		frame.setVisible(true); // 设置窗体可见，默认为不可见
	}

	public FlowLayout_Example() {
		super(); // 继承父类的构造方法
		setTitle("流布局管理器示例"); // 设置窗体的标题
		setBounds(100, 100, 500, 375); // 设置窗体的显示位置及大小
		getContentPane().setLayout(null); // 设置为不采用任何布局管理器
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置窗体关闭按钮的动作为退出

		final FlowLayout flowLayout = new FlowLayout(); // 创建流布局管理器对象
		flowLayout.setHgap(10); // 设置组件的水平间距
		flowLayout.setVgap(10); // 设置组件的垂直间距
		flowLayout.setAlignment(FlowLayout.LEFT); // 设置组件的对齐方式
		getContentPane().setLayout(flowLayout); // 设置组件容器采用流布局管理器

		final JButton aButton = new JButton();
		aButton.setText("按钮 A");
		getContentPane().add(aButton);

		final JButton bButton = new JButton();
		bButton.setText("按钮 B");
		getContentPane().add(bButton);

		final JButton cButton = new JButton();
		cButton.setText("按钮 C");
		getContentPane().add(cButton);

	}

}
