package com.iss.storeApplication;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.iss.storeApplication.view.LoginPopupView;
import com.iss.storeApplication.view.MainView;


public class StoreApps {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainView inst = new MainView();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setExtendedState(inst.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				
				LoginPopupView login = new LoginPopupView();
				boolean loginStatus = login.Login();
				if(!loginStatus)
				{
					inst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		            inst.setVisible(false);
				}
				
				}
		});

	}

}
