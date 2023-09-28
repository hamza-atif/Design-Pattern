/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.ChainofResponsibility.FileHandler;

public class DocHandler extends BaseHandler{
	String name;
	
	public DocHandler(String name) {
		this.name = name;
	}
	@Override
	public void handle(File file) {
		if(file.getType()==Type.DOC){
			System.out.println("Processing and saving DOC file by "+getName());
		}
		else if (next!= null){
			System.out.println(getName()+" forwards request to "+next.getName());
			next.handle(file);
		}
		else{
			System.out.println("Your request cannot be handled");
		}
		
	}

	@Override
	public String getName() {
		return name;
	}
	
}