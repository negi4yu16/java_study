package test.ch05.common;
import java.lang.reflect.Field;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;
import junit.framework.TestCase;

public class MyDJUnitTestCase extends TestCase {

	public MyDJUnitTestCase() {
		super();
	}
	public MyDJUnitTestCase(String name) {
		super(name);

	}

	protected void setUp() throws Exception {
		super.setUp();
		MockObjectManager.initialize();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public static void addReturnNull(String className, String methodName) {
		MockObjectManager.addReturnNull(className, methodName);
	}

	public static void addReturnValue(String className, String methodName) {
		MockObjectManager.addReturnValue(className, methodName);
	}

	public static void addReturnValue(String className, String methodName, Object returnValue) {
		MockObjectManager.addReturnValue(className, methodName, returnValue);
	}
	public static void assertArgumentPassed(
			String className,
			String methodName,
			int argumentindex,
			Object argumentValue) {
		MockObjectManager.assertArgumentPassed(className, methodName, argumentindex, argumentValue);
	}

	public static void assertCalled(String className, String methodName) {
		MockObjectManager.assertCalled(className, methodName);
	}

	public static void assertNotCalled(String className, String methodName) {
		MockObjectManager.assertNotCalled(className, methodName);
	}

	public static Object getArgument(String className, String methodName, int argumentIndex) {
		return MockObjectManager.getArgument(className, methodName, argumentIndex);
	}

	public static Object getArgument(String className, String methodName, int methodIndex, int argumentIndex) {
		return MockObjectManager.getArgument(className, methodName, methodIndex, argumentIndex);
	}

	public static int getCallCount(String className, String methodName) {
		return MockObjectManager.getCallCount(className, methodName);
	}

	public static Object getReturnValue(String className, String methodName) {
		return MockObjectManager.getReturnValue(className, methodName);
	}

	public static boolean isCalled(String className, String methodName) {
		return MockObjectManager.isCalled(className, methodName);
	}

	public static void setReturnValueAt(String className, String methodName, int index, Object returnValue) {
		MockObjectManager.setReturnValueAt(className, methodName, index, returnValue);
	}

	public static void setReturnValueAt(String className, String methodName, int index) {
		MockObjectManager.setReturnValueAt(className, methodName, index);
	}

	public static void setReturnNullAt(String className, String methodName, int index) {
		MockObjectManager.setReturnNullAt(className, methodName, index);
	}

	public static void setReturnValueAtAllTimes(String className, String methodName, Object returnValue) {
		MockObjectManager.setReturnValueAtAllTimes(className, methodName, returnValue);
	}

	public static void setReturnValueAtAllTimes(String className, String methodName) {
		MockObjectManager.setReturnValueAtAllTimes(className, methodName);
	}

	public static void setReturnNullAtAllTimes(String className, String methodName) {
		MockObjectManager.setReturnNullAtAllTimes(className, methodName);
	}

	public static Object getPrivateFieldValue(Object obj, String field){

		Field fld = null;
		try{
			fld = getFieldFromClass(obj.getClass(), field);
			fld.setAccessible(true);
			return fld.get(obj);
		}catch(NoSuchFieldException e){
			fail("No Such Field("+field+")");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			fail();
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			fail();
			e.printStackTrace();
		}

		return null;

	}

	protected static Field getFieldFromClass(Class<?> clazz, String fieldName) throws NoSuchFieldException {
		Field field = null;
		while(clazz != null){
			try {
				field = clazz.getDeclaredField(fieldName);
				break;
			}catch(NoSuchFieldException e){
				clazz = clazz.getSuperclass();
			}
		}

		if(field == null ){
			throw new NoSuchFieldException();
		}
		return field;
	}


}