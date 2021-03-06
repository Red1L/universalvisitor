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
package org.kametic.universalvisitor.api;


/**
 * @author Epo Jemba
 * @author Pierre Thirouin
 */
public interface Filter<T>
{

    boolean retains(T input);

    Filter<?> TRUE = new Filter<Object>()
                {
                    @Override
                    public boolean retains(Object input)
                    {
                        // TODO Auto-generated method stub
                        return true;
                    }
                };

}
