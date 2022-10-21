//ApplicationActionBarAdvisor类继承ActionBarAdvisor类

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {
	private UpdateAction updateAction;// 定义一个UpdateAction类的实例

//构造方法，调用父类的就可以了

public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
  super(configurer);
 }

//这里new一个UpdateAction的实例

	protected void makeActions(IWorkbenchWindow window) {
		updateAction = new UpdateAction(window);

		register(updateAction);//   注册一下，然后你就可以用快捷键调用这个action了

	}

//这个方法把action添加到help菜单中，至于什么是menumanager我就不讲了吧，呵呵。运行之后你就可以看见help菜单下有一个Update项了，Update是你在UpdateAction中用setText（）定义的，如果你定义了image，你还可以看到图标

protected void fillMenuBar(IMenuManager menuBar) {
MenuManager helpMenu = new MenuManager("&Help", "help");

helpMenu.add(updateAction);

}