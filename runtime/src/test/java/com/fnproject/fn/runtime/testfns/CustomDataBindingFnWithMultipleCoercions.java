package com.fnproject.fn.runtime.testfns;

import com.fnproject.fn.api.RuntimeContext;
import com.fnproject.fn.api.FnConfiguration;

import com.fnproject.fn.runtime.testfns.coercions.StringReversalCoercion;
import com.fnproject.fn.runtime.testfns.coercions.StringUpperCaseCoercion;

public class CustomDataBindingFnWithMultipleCoercions {

        @FnConfiguration
        public static void inputConfig(RuntimeContext ctx){
            ctx.addInputCoercion(new StringUpperCaseCoercion());
            ctx.addInputCoercion(new StringReversalCoercion());
        }

        public String echo(String s){
            return s;
        }

}
