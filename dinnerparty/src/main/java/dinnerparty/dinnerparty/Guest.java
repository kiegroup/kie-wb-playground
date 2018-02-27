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

public class Guest implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label("Unique identifier")
    private java.lang.String name;
    private dinnerparty.dinnerparty.Job job;
    @org.kie.api.definition.type.Label("Gender (M/F)")
    private java.lang.String gender;

    private java.lang.Long id;

    public Guest() {
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public dinnerparty.dinnerparty.Job getJob() {
        return this.job;
    }

    public void setJob(dinnerparty.dinnerparty.Job job) {
        this.job = job;
    }

    public java.lang.String getGender() {
        return this.gender;
    }

    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }

    public java.lang.Long getId() {
        return this.id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public Guest(java.lang.String name,
                 dinnerparty.dinnerparty.Job job,
                 java.lang.String gender,
                 java.lang.Long id) {
        this.name = name;
        this.job = job;
        this.gender = gender;
        this.id = id;
    }
}