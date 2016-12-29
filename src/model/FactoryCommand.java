package model;

public class FactoryCommand {
	private FactoryCommand(){}
	private static FactoryCommand instance = 
									new FactoryCommand();
	public static FactoryCommand newInstance(){
		return instance;
	}
	
	public ICommand createCommand(String cmd){
		if(cmd.equals("REGISTER")){
			return new RegisterCommand();
		}
		else if(cmd.equals("CONFIRM")){
			return new ConfirmCommand();
		}
		else if(cmd.equals("COMPLETE")){
			return new CompleteCommand();
		}
		else if(cmd.equals("MAIN")){
			return new MainCommand();
		}
		else{
			// 肋给等 夸没俊 措茄 贸府
			return null;
		}
	}
}
