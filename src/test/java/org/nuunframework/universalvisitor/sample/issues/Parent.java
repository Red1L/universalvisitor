/**
 * Copyright (C) 2014 Kametic <epo.jemba@kametic.com>
 *
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * or any later version
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.nuunframework.universalvisitor.sample.issues;

/**
 * @author epo.jemba@kametic.com
 */
public abstract class Parent implements Interface
{

    private Issue1   parentPrivate   = new Issue1();
    protected Issue1 parentProtected = new Issue1();
    Issue1           parentPackage   = new Issue1();
    public Issue1    parentPublic    = new Issue1();

    //

    private void parentPrivate()
    {
    }

    protected void parentProtected()
    {
    }

    void parentPackage()
    {
    }

    public void parentPublic()
    {
    }

}
