public class UpdateAction extends Action implements IAction {
	 
	private IWorkbenchWindow window;

	 

	public UpdateAction(IWorkbenchWindow window) {
    this.window = window;
    setId("org.eclipsercp.hyperbola.newUpdates");
    setText("&Update...");
    setToolTipText("Search for updates to Hyperbola");
    setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
        Application.PLUGIN_ID, "icons/usearch_obj.gif"));
    window.getWorkbench().getHelpSystem().setHelp(this,
        "org.eclipsercp.hyperbola.updates");
  } 

	public void run() {
    BusyIndicator.showWhile(window.getShell().getDisplay(),
        new Runnable() {
          public void run() {
            UpdateJob job = new UpdateJob(
                "Searching for updates", false, false);
            UpdateManagerUI.openInstaller(window.getShell(), job);
          }
        });
  }
}