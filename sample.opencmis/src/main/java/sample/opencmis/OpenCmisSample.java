package sample.opencmis;

import org.osgi.service.component.annotations.Reference;

import aQute.bnd.annotation.component.Component;

@Component
public class OpenCmisSample
{
	@Reference
	SessionFactory sessionFactory;

	public void testOpenCmis()
	{
		// do sth. with sessionFactory
	}
}
