/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
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

package dinnerparty.dinnerparty;

public class Job implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private JobType type;
    private java.lang.String name;

    private java.lang.Long id;

    public Job() {
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public dinnerparty.dinnerparty.JobType getType() {
        return this.type;
    }

    public void setType(dinnerparty.dinnerparty.JobType type) {
        this.type = type;
    }

    public java.lang.Long getId() {
        return this.id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public Job(dinnerparty.dinnerparty.JobType type,
               java.lang.String name,
               java.lang.Long id) {
        this.type = type;
        this.name = name;
        this.id = id;
    }
}