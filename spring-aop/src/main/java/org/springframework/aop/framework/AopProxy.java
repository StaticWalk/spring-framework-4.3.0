/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.aop.framework;

/**
 * Delegate interface for a configured AOP staticProxy, allowing for the creation
 * of actual staticProxy objects.
 *
 * <p>Out-of-the-box implementations are available for JDK dynamic proxies
 * and for CGLIB proxies, as applied by {@link DefaultAopProxyFactory}.
 *
 * @author Rod Johnson
 * @author Juergen Hoeller
 * @see DefaultAopProxyFactory
 */
public interface AopProxy {

	/**
	 * Create a new staticProxy object.
	 * <p>Uses the AopProxy's default class loader (if necessary for staticProxy creation):
	 * usually, the thread context class loader.
	 * @return the new staticProxy object (never {@code null})
	 * @see Thread#getContextClassLoader()
	 */
	Object getProxy();

	/**
	 * Create a new staticProxy object.
	 * <p>Uses the given class loader (if necessary for staticProxy creation).
	 * {@code null} will simply be passed down and thus lead to the low-level
	 * staticProxy facility's default, which is usually different from the default chosen
	 * by the AopProxy implementation's {@link #getProxy()} method.
	 * @param classLoader the class loader to create the staticProxy with
	 * (or {@code null} for the low-level staticProxy facility's default)
	 * @return the new staticProxy object (never {@code null})
	 */
	Object getProxy(ClassLoader classLoader);

}
