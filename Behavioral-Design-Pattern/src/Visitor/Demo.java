package Visitor;

public class Demo {

	public static void main(String[] args) {
		WindowsConfig windowsConfig = new WindowsConfig();
		LinuxConfig linuxConfig = new LinuxConfig();
		
		DLinkRouter dLinkRouter = new DLinkRouter();
		dLinkRouter.accept(windowsConfig);
		dLinkRouter.accept(linuxConfig);
		
		TPLinkRouter tpLinkRouter = new TPLinkRouter();
		tpLinkRouter.accept(windowsConfig);
		tpLinkRouter.accept(linuxConfig);

	}

}
