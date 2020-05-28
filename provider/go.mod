module github.com/pulumi/pulumi-linode/provider/v2

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.11.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.4.0
	github.com/pulumi/pulumi/pkg/v2 v2.3.0 // indirect
	github.com/pulumi/pulumi/sdk/v2 v2.3.0
	github.com/terraform-providers/terraform-provider-linode v1.11.0
)

replace github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
