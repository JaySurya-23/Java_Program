package BasicException;

public class Rule_overrided_Exception {
	
	
	class Parent {
		// rule 1:If parent does not declare any exception
		// public void show()
		// {
		//
		// }

		// rule 2:If Parent declare any exception

		public void show() throws Exception {

		}

		// public void show() throws IOException
		// {
		//
		// }
	}

	class Child extends Parent {
		// rule 1:either child also does not declare any exception
		// or child can declare only unchecked type exception not checked type
		// public void show() throws NullPointerException
		// {
		//
		// }
		// public void show() throws IOException //Error
		// {
		//
		// }

		// rule 2:1) either child does not declare any exception
		// public void show()
		// {
		//
		// }

		// rule 2:2) child can dclare same exception

		// public void show() throws Exception
		// {
		//
		// }

		// rule 2:3) child can able to declare child exception

		// public void show() throws IOException
		// {
		//
		// }

		// rule 2:4) child can not declare parent exception
		// public void show() throws Exception //Error
		// {
		//
		// }
	}

	

}
