package com.iteratrlearning.design_patterns.problems.proxy;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: implement the ReadOnlyInvocationHandler so that it blocks all method
// calls to methods whose name starts with "set"
@Ignore
public class ReadOnlyInvocationHandlerTest
{

    private Person person = new SimplePerson("Richard", 33);
    private Person readOnlyPerson = ReadOnlyInvocationHandler.newInstance(person);

    @Test
    public void shouldReadPropertiesThroughProxy()
    {
        assertEquals(person.getName(), readOnlyPerson.getName());
        assertEquals(person.getAge(), readOnlyPerson.getAge());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldBlockSetName()
    {
        readOnlyPerson.setName("Raoul");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldBlockSetAge()
    {
        readOnlyPerson.setAge(75);
    }
}
