module github.com/pulumi/pulumi-linode/provider/v2

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.11.0 // indirect
	github.com/linode/terraform-provider-linode v1.11.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.22.1
	github.com/pulumi/pulumi/sdk/v2 v2.22.1-0.20210310211618-1f16423ede4c
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20201218231525-9cca98608a5e
	github.com/linode/terraform-provider-linode => github.com/pulumi/terraform-provider-linode v1.11.2-0.20210312125247-5f81f1ff2f65
)
