<h:form>
                <h1><h:outputText value="List"/></h1>
                <h:dataTable border="1" width="80%" value="#{employeeMB.findAll()}" var="item">
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Id"/>
                        </f:facet>
                        <h:outputText value="#{item.id}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Name"/>
                        </f:facet>
                        <h:outputText value="#{item.name}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Password"/>
                        </f:facet>
                        <h:outputText value="#{item.password}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Job"/>
                        </f:facet>
                        <h:outputText value="#{item.job}"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Action"/>
                        </f:facet>
                        <h:commandButton value="delete" action="#{employeeMB.delete(item.id)}"/>
                    </h:column>
                </h:dataTable>
                <h:commandButton value="Create new" action="#{employeeMB.displaycreate()}"/>
            </h:form>
